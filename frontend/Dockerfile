FROM nginx:1.17
#RUN apk add nano && apk add curl
#COPY ./index.html /usr/share/nginx/html
COPY build/ /usr/share/nginx/html
RUN rm -rf /etc/nginx/conf.d/default.conf
COPY ./frontend-nginx.conf /etc/nginx/conf.d
EXPOSE 80